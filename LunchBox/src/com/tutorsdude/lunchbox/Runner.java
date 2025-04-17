package com.tutorsdude.lunchbox;

import com.tutorsdude.lunchbox.LunchBoxesTypes.*;

public class Runner {
    public static void main(String[] args) {


                LunchBoxes lunchboxes = new LunchBoxes();
                System.out.println(lunchboxes.type);

                lunchboxes.typeOfBoxes();

                Insulated insulated = new Insulated();
                System.out.println(insulated.type);
                System.out.println(insulated.brand);
                System.out.println(insulated.price);

                insulated.giveImportance();

                Urbanfix urbanfix = new Urbanfix();
                System.out.println(urbanfix.type);
                System.out.println(urbanfix.brand);
                System.out.println(urbanfix.price);

                urbanfix.giveQuality();

                Yelona yelona = new Yelona();
                System.out.println(yelona.type);
                System.out.println(yelona.brand);
                System.out.println(yelona.price);

                yelona.purpose();

                StainlessSteel stainlessSteel = new StainlessSteel();
                System.out.println(stainlessSteel.type);
                System.out.println(stainlessSteel.brand);
                System.out.println(stainlessSteel.price);

                stainlessSteel.giveUsage();

                Milton milton = new Milton();
                System.out.println(milton.type);
                System.out.println(milton.brand);
                System.out.println(milton.price);

                milton.miltonBrand();

                Uninox uninox = new Uninox();
                System.out.println(uninox.type);
                System.out.println(uninox.brand);
                System.out.println(uninox.price);


                uninox.uninoxBrand();


                Plastic plastic = new Plastic();
                System.out.println(plastic.type);
                System.out.println(plastic.brand);
                System.out.println(plastic.price);

                plastic.benefits();

                Oliveware oliveware = new Oliveware();
                System.out.println(oliveware.type);
                System.out.println(oliveware.brand);
                System.out.println(oliveware.price);

                oliveware.olivewareBrand();

                PlainPlastic plainPlastic = new PlainPlastic();
                System.out.println(plainPlastic.type);
                System.out.println(plainPlastic.brand);
                System.out.println(plainPlastic.price);

                plainPlastic.plainPlasticBrand();


            }
        }



