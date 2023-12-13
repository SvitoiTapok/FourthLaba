import AbstractClasses.GroupCarry;
import AbstractClasses.Sound;
import Classes.*;
import Enums.MaterialsName;
import Exceprions.DencityException;
import Exceprions.MoveException;
import Interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass_TheWonderfulStory {
    public static void main(String[] args) {
        Astronaut FirstAstronaut = new Astronaut("cave", "Nil");
        Material lunit = new Material(MaterialsName.LUNIT);
        try {
            lunit.setMassPerMeter3(10000);
        }catch (DencityException e){
            System.out.println("Lunit must have positive dencity");
            System.exit(0);
        }

        Material antilunit = new Material(MaterialsName.ANTILUNIT);
        try {
            antilunit.setMassPerMeter3(20000);
        }catch (DencityException e){
            System.out.println("Antilunit must have positive dencity");
            System.exit(0);
        }
        //try{
        //    if(lunit.getMassPerMeter3() < 0)
        //        throw new DencityException();
        //    else
        //        System.out.println("Lunit have correct dencity");
        //}catch (DencityException e){
        //    System.out.println("Lunit have positive dencity");
        //}
        FirstAstronaut.mine(lunit, 200);
        FirstAstronaut.mine(antilunit, 200);
        Sound noSound = new Sound("") {
            @Override
            public void sound() {
                System.out.println("We can't hear sound in the vacuum");
            }
        };
        noSound.sound();
        Znayka znayka = Znayka.INSTANSE;
        znayka.say("доставьте Незнайку в ракету");
        znayka.say("ракета не пострадала от метеоров, герметизация не нарушена; однако многие механизмы нуждаются в регулировке, а аккумуляторы -- в смене электролита и зарядке");
        znayka.say("Все оставшееся время использовать для добычи и погрузки в ракету лунита и антилунита.");
        Pilulkin pilulkin = Pilulkin.INSTANSE;
        pilulkin.setLocation("Moon");
        pilulkin.move("rocket gateway");
        Neznayka neznayka = Neznayka.INSTANSE;

        pilulkin.carry(neznayka, "rocket gateway");
        Fucsia fucsia = Fucsia.INSTANSE;
        Seledochka seledochka = Seledochka.INSTANSE;
        ICarry[] ICarries = {pilulkin, fucsia, seledochka, znayka};
        ArrayList<ICarry> carriers1 = new ArrayList<>(Arrays.asList(ICarries));
        GroupCarry group = new SingleGroup(carriers1);
        group.groupCarry(neznayka, "rocket");
        neznayka.move("kayuta");
        String [] dresses0 = {"spacesuit", "clothes"};
        ArrayList<String> dresses = new ArrayList<>(Arrays.asList(dresses0));
        neznayka.setClothes(dresses);
        neznayka.takeOffCloth("spacesuit");
        neznayka.takeOffCloth("clothes");
        neznayka.lay("koyka");
        try {
            if (!neznayka.isCanMove())
                throw new MoveException("character can't move");
        }catch (MoveException e){
            System.out.println("Neznayka can't move anymore");
        }
        neznayka.weaking("sickness");





    }
}
/*
Космонавты, оставшиеся в пещере, решети не терять время зря
и принялись за добычу лунита и антилунита. Ледорубы и
геологические молотки дружно застучали о скалы. Впрочем,
никакого стука не было слышно, потому что звук, как это теперь
уже всем известно, не распространяется в безвоздушной среде.
В напряженной работе прошло около часа. Скоро от Знайки было
получено по радиотелефону распоряжение доставить Незнайку в
ракету. Знайка сообщил, что ракета не пострадала от метеоров,
герметизация не нарушена; однако многие механизмы нуждаются в
регулировке, а аккумуляторы -- в смене электролита и зарядке.
На все это потребуется не менее двенадцати часов, поэтому все
Оставшееся время Знайка велел использовать для добычи и
погрузки в ракету лунита и антилунита.
Доктор Пилюлькин, ни секунды не медля, отправился внутрь,
везя перед собой кресло-качалку, на котором лежал Незнайка в
своем скафандре. Когда Пилюлькин наконец доковылял до ракеты.
Незнайка ослабел настолько, что не мог встать с кресла, и его
пришлось нести на руках. С помощью Знайки, Фуксии и Селедочки
Пилюлькину удалось втащить Незнайку в ракету. Здесь с Незнайки
стащили скафандр, сняли одежду и уложили на койку в каюте.
Освободившись от тяжелого скафандра, Незнайка почувствовал
некоторое облегчение и даже порывался встать с койки, но
постепенно силы снова покинули его. Слабость наступила такая,
что ему трудно было пошевелить рукой или ногой.
-- Что это за болезнь такая? -- говорил Незнайка. -- Мне
кажется, будто я весь свинцовый и мое тело весит втрое больше,
чем нужно.
*/
