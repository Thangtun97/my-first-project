package com.example.develop.appquanlichitieu.Model;

/**
 * Created by Develop on 5/6/2018.
 */

public class TaiKhoan {

    int id;
    String TenTaiKhoan;
    float SoTienTaiKhoan;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenTaiKhoan, float soTienTaiKhoan) {
        TenTaiKhoan = tenTaiKhoan;
        SoTienTaiKhoan = soTienTaiKhoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        TenTaiKhoan = tenTaiKhoan;
    }

    public float getSoTienTaiKhoan() {
        return SoTienTaiKhoan;
    }

    public void setSoTienTaiKhoan(float soTienTaiKhoan) {
        SoTienTaiKhoan = soTienTaiKhoan;
    }

    @Override
    public String toString() {
        return TenTaiKhoan;
    }
}
