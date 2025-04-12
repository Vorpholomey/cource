package Lession7.data_base;

import java.sql.Timestamp;
import java.util.Objects;

public class CreatorClass {
    private long id;
    private String login;
    private String name;
    private boolean isActive;
    private boolean isGroup;
    private Timestamp creationDate;
    private String guid;
    private Timestamp updateDate;

    public CreatorClass(long id,
                        String login,
                        String name,
                        boolean isActive,
                        boolean isGroup,
                        Timestamp creationDate,
                        String guid,
                        Timestamp updateDate) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.isActive = isActive;
        this.isGroup = isGroup;
        this.creationDate = creationDate;
        this.guid = guid;
        this.updateDate = updateDate;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isGroup() {
        return isGroup;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public String getGuid() {
        return guid;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public void setGroup(boolean group) {
        isGroup = group;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "CreatorClass{" + "\n" +
                " id=" + id + "\n" +
                " login=" + login + "\n" +
                " name=" + name + "\n" +
                " isActive=" + isActive + "\n" +
                " isGroup=" + isGroup + "\n" +
                " creationDate=" + creationDate + "\n" +
                " guid=" + guid + "\n" +
                " updateDate=" + updateDate + "\n" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatorClass that = (CreatorClass) o;
        return id == that.id &&
                isActive == that.isActive &&
                isGroup == that.isGroup &&
                Objects.equals(login, that.login) &&
                Objects.equals(name, that.name) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(creationDate, that.creationDate);
    }

}

