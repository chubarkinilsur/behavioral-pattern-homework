package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class HundredDollarHandler extends DollarHandlerBase {

    protected int value = 100;

    public HundredDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
