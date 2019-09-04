package com.example.kontakjodoh.model;

import com.example.kontakjodoh.R;

import java.util.ArrayList;

public class KontakData {
    public static String[][] data = new String[][]{
            {"Fajriah Anjaswati", "Available", "Pengertian ● Sabar ● Istiqomah", "https://i2.wp.com/pengertian.org/wp-content/uploads/2019/07/wanita-sholeha.jpg?resize=768%2C511&ssl=1", "Jepara, 20 Juni 1990", "168 Cm", "48 Kg","Dosen"},
            {"Fatimah Astriani", "Available", "Can be your personal chef", "https://2.bp.blogspot.com/-b0wcdpMqieU/V1SgQUGvf0I/AAAAAAAAFoU/i2KAhxI-fKkRDB41Z3bpoCpUd4upxUeSACLcB/s1600/Foto%2BGadis%2BBerjilbab%2BCantik%2B25.jpg", "Tangerang, 11 Juni 1988", "162 Cm", "40 Kg","Chef"},
            {"Sheilla Shilvyra", "Nadzor", "Allah knows best", "https://cdns.klimg.com/dream.co.id/resources/news/2018/10/19/94846/664xauto-deretan-muslimah-paling-berpengaruh-di-ekonomi-181019r-rev181020.jpg", "Jakarta, 17 Mei 1996", "165 Cm", "47 Kg","Programmer"},
            {"Tina Sulistina", "Nadzor", "Assalamu'alaikum! Tina's here!", "https://4.bp.blogspot.com/-9VGH5ITv91g/VxCrZBHNqHI/AAAAAAAABrc/vKdBoeOBFTUrvydNLL9n4SUrSRPg9_34gCLcB/s640/wanita%2Bsolehah.png", "Malang, 21 Juli 1992", "159 Cm", "48 Kg","Guru"},
            {"Sarboah Ria", "Khitbah", "Assalamu'alaikum! Ria's here!", "https://dirtycurls.net/wp-content/uploads/2017/11/wanita-sholehah-bersama-suami-di-surga-500x330.jpg","Indramayu, 5 Maret 1980", "160 Cm", "48 Kg","-"},
            {"Harry Suppotter", "Available", "Avada Kadavra!", "https://era-m.us/media/2015/03/6tbFBP4R.jpeg", "London, 11 Januari 1988", "170 Cm", "65 Kg","Aktor"},
            {"Dominic Tore-to're", "Nadzor", "Assalamu'alaikum! Dom's here!", "https://topicimages.mrowl.com/large/ballsohard/avengers_infin/cast/vindiesel_1.jpg", "Madura, 8 Desember 1977", "185 Cm", "125 Kg","Driver"},
            {"Frodo Bagiins", "Available", "I wish, I could have my precious soon with me.", "https://pbs.twimg.com/profile_images/769846276624158721/aYwmSqm6_400x400.jpg", "Bandung, 10 Maret 1988", "155 Cm", "48 Kg","Traveler"},
            {"Pee Mak Phrasej Arhah", "Khitbah", "S̄ạntip̣hāph cng mī dæ̀ khuṇ", "https://www.wowkeren.com/images/photo/mario_maurer.jpg", "Sorong, 16 April 1982", "175 Cm", "70 Kg","Nạk s̄ædng chāy"}

    };


    public static ArrayList<Kontak> getListData() {
        ArrayList<Kontak> list = new ArrayList<>();
        for (String[] aData : data) {
            Kontak k = new Kontak();
            k.setNama(aData[0]);
            k.setStatus(aData[1]);
            k.setAbout(aData[2]);
            k.setPhoto(aData[3]);
            k.setR1(aData[4]);
            k.setR2(aData[5]);
            k.setR3(aData[6]);
            k.setR4(aData[7]);



            list.add(k);
        }

        return list;

    }

}