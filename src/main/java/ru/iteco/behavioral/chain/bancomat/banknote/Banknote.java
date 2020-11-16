package ru.iteco.behavioral.chain.bancomat.banknote;

/**
 * Banknote.
 *
 * @author Ilya_Sukhachev
 */
public class Banknote {

    protected CurrencyType currency;
    protected int value;

    public Banknote(CurrencyType currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
