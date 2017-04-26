package team.sevendwarfs.persistence.entities;

import javax.persistence.*;

/**
 * Created by deng on 2017/4/26.
 */
@Entity
@Table(name = "movie")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password_md5")
    private String passwordMD5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return passwordMD5;
    }

    public void setPassword(String password) {
        this.passwordMD5 = password;
    }
}
