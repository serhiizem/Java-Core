package com.preparation.interfaces;

/**
 * Created by sulfur on 05.04.16.
 */
interface Instrument {
    /*
    Нет нужды обьявлять методы в интерфейсе при их описании открытыми(public),
    поскольку они являются таковыми даже без спецификатора по умолчанию.
    */

    /*
    Однако при реализации интерфейса его методы должны быть обьявлены как public,
    в противном случае будет использоваться доступ в пределах пакета, а это при-
    ведет к уменьшению уровня доступа.
    */

    void adjust();
    void play(Note n);
}