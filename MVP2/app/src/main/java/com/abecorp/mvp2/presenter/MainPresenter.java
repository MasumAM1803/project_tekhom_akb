/*
Tanggal Pengerjaan : 16 - 05 - 2019
NIM     : 10116342
Nama    : Ma'sum Abdul Matin
Kelas   : IF 8
 */
package com.abecorp.mvp2.presenter;

import com.abecorp.mvp2.model.User;

public interface MainPresenter {


    void save(User user);

    void update(User user);

    void delete(User user);

    void load();
}