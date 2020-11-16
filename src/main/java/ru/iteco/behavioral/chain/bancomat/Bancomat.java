package ru.iteco.behavioral.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.FiftyDollarHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.HundredDollarHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.TenDollarHandler;
import ru.iteco.behavioral.chain.bancomat.ruble.FiveHundredRubleHandler;
import ru.iteco.behavioral.chain.bancomat.ruble.HundredRubleHandler;
import ru.iteco.behavioral.chain.bancomat.ruble.ThousandRubleHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new TenDollarHandler(null);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
        handler = new HundredRubleHandler(handler);
        handler = new FiveHundredRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
    }

    public String cash(Banknote banknote) {
        if (validate(banknote)) {
            return banknote.getValue() + "=" +handler.cash(banknote);
        } else {
            return banknote.getCurrency().toString() + " что то пощло не так";
        }

    }

    private boolean validate(Banknote banknote) {
        return handler.validate(banknote);
    }
}
