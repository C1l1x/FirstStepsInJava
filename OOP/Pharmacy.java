/*
Да се състави програма, която съхранява в масив следната информация за лекарствата в една аптека:
    - наименование символен низ;
    - цена - реално число;
    - налично количество - цяло число;
    - дата, до която е годно за употреба;

    и извършва следните операции, избрани от меню:
    - добавя към масива данните на ново лекарство;
    - извежда всички въведени данни;
    - извежда имената на лекарствата с цена над 5 лв.;
    - създава нов масив с данните на лекарствата с налични количества под 10 броя;
    - създава нов масив с имената на лекарствата с изтичащ срок на годност на зададена дата.

Забележка:
Създайте клас за опериране с дата, който да използвате като член данни за срок на годност.
*/

public class Pharmacy {

    Date date;
    public Pharmacy(){
        date = new Date();
    }
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
    }
}