package ru.iteco.behavioral.chain.bancomat.ruble;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

public abstract class RubleHandlerBase extends BanknoteHandler {

    private CurrencyType type = CurrencyType.RUB;

    protected RubleHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected CurrencyType getType() {
        return type;
    }

    protected abstract int getValue();
}
