package com.example.btvn_buoi4.Group;

public class Group {
    private int imgResource;
    private String nameGroup;
    private int qtyFolower;
    private int qtyPost;
    private int status;

    public Group(int imgResource, String nameGroup, int qtyFolower, int qtyPost, int status) {
        this.imgResource = imgResource;
        this.nameGroup = nameGroup;
        this.qtyFolower = qtyFolower;
        this.qtyPost = qtyPost;
        this.status = status;
    }


    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getQtyFolower() {
        return qtyFolower;
    }

    public void setQtyFolower(int qtyFolower) {
        this.qtyFolower = qtyFolower;
    }

    public int getQtyPost() {
        return qtyPost;
    }

    public void setQtyPost(int qtyPost) {
        this.qtyPost = qtyPost;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
