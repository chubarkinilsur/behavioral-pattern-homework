package ru.iteco.behavioral.chain.bancomat.banknote;

import ru.iteco.behavioral.chain.bancomat.dollar.DollarHandlerBase;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(String banknote) {
        return nextHandler != null && nextHandler.validate(banknote);
    }

    public boolean cash(int money) {

        return nextHandler != null && nextHandler.cash(money);
    }
}
