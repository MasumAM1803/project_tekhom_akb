/*
Tanggal Pengerjaan : 16 - 05 - 2019
NIM     : 10116342
Nama    : Ma'sum Abdul Matin
Kelas   : IF 8
 */
package com.abecorp.mvp2.view;

import com.abecorp.mvp2.model.User;

import java.util.List;

public interface MainView {

    void onLoad(List<User> users);


    void onSave();

    void onDelete();

    void onUpdate();
}