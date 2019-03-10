package com.kinitoapps.bloodhub;

/**
 * Created by HP on 21-09-2017.
 */

public class Users {

    public String userDesc;
    public String userName;
    public String profilePicLink;
    public Users() {

    }



    public Users(String name, String link, String desc) {
        this.userName = name;
        this.profilePicLink = link;
        this.userDesc=desc;

    }
    public String getUserDesc() {
        return userDesc;}

    public String getUserName() {
        return userName;
    }


    public String getProfilePicLink() {
        return profilePicLink;
    }
}
