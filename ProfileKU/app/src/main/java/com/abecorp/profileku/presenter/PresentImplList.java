/*
Tanggal Pengerjaan : 16 - 05 - 2019
NIM     : 10116342
Nama    : Ma'sum Abdul Matin
Kelas   : IF 8
 */
package com.abecorp.profileku.presenter;

import com.abecorp.profileku.model.contactItem;
import com.abecorp.profileku.view.ViewList;

import java.util.ArrayList;
import java.util.List;

public class PresentImplList implements PresentList{
    
    private ViewList viewList;
    private List<contactItem> contItem;

    public PresentImplList(ViewList viewList) {
        this.viewList = viewList;

        /*
        contItem = new ArrayList<>();
        contItem.add(new contactItem("10113466", "Agung Husein", "IF9", "081664372981", "husagung@gmail.com", "Huseagung"));
        contItem.add(new contactItem("10113462", "Neng Chacha", "IF2", "089777612345", "cachaneng@gmail.com", "cachaneng"));
        contItem.add(new contactItem("10113464", "Ujang Salim", "IF1", "087899653476", "salimunjang@gmail.com", "salimunjang"));
        contItem.add(new contactItem("10113490", "Shiddiq ilham", "IF3", "082213456780", "shiddiqHam@gmail.com", "shiddiqHam"));
        contItem.add(new contactItem("10113445", "Yanti Santika", "IF3", "0821245689023", "yansantika@gmail.com", "yansantika"));
        contItem.add(new contactItem("10113234", "Nisa Aprilia", "IF7", "088823045682", "nisaprilia@gmail.com", "nisaprilia"));
        contItem.add(new contactItem("10113478", "Asep Surasep", "IF8", "081346789234", "surAsep3@gmail.com", "surAsep3"));
        */
    }


    @Override
    public void load() {
        viewList.onLoad(contItem);
    }
}
