package Lession7.data_base;

import java.sql.Timestamp;
import java.util.Objects;

public class DictionaryDomain {
    private long id;
    private String code;
    private String schema;
    private String urn;
    private String name;
    private boolean isEntity;
    private boolean isSystem;
    private Timestamp creationDate;
    private CreatorClass creatorClass;
    private String description;
    private int groupId;
    private int dataGroupId;
    private int adminGroupId;

    public DictionaryDomain(long id,
                            String code,
                            String schema,
                            String urn,
                            String name,
                            boolean isEntity,
                            boolean isSystem,
                            Timestamp creationDate,
                            CreatorClass creatorClass,
                            String description,
                            int groupId,
                            int dataGroupId,
                            int adminGroupId) {
        this.id = id;
        this.code = code;
        this.schema = schema;
        this.urn = urn;
        this.name = name;
        this.isEntity = isEntity;
        this.isSystem = isSystem;
        this.creationDate = creationDate;
        this.creatorClass = creatorClass;
        this.description = description;
        this.groupId = groupId;
        this.dataGroupId = dataGroupId;
        this.adminGroupId = adminGroupId;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getSchema() {
        return schema;
    }

    public String getUrn() {
        return urn;
    }

    public String getName() {
        return name;
    }

    public boolean isEntity() {
        return isEntity;
    }

    public boolean isSystem() {
        return isSystem;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public CreatorClass getCreatorClass() {
        return creatorClass;
    }

    public String getDescription() {
        return description;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getDataGroupId() {
        return dataGroupId;
    }

    public int getAdminGroupId() {
        return adminGroupId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntity(boolean entity) {
        isEntity = entity;
    }

    public void setSystem(boolean system) {
        isSystem = system;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreatorClass(CreatorClass creatorClass) {
        this.creatorClass = creatorClass;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setDataGroupId(int dataGroupId) {
        this.dataGroupId = dataGroupId;
    }

    public void setAdminGroupId(int adminGroupId) {
        this.adminGroupId = adminGroupId;
    }

    @Override
    public String toString() {
        return "DictionaryDomain{" + "\n" +
                " id=" + id + ",\n" +
                " code=" + code + ",\n" +
                " schema=" + schema + ",\n" +
                " urn=" + urn + ",\n" +
                " name=" + name + ",\n" +
                " entity=" + isEntity + ",\n" +
                " system=" + isSystem + ",\n" +
                " creationDate=" + creationDate + ",\n" +
                " creationId=" + creatorClass + ",\n" +
                " description=" + description + ",\n" +
                " groupId=" + groupId + ",\n" +
                " dataGroup=" + dataGroupId + ",\n" +
                " adminGroupId=" + adminGroupId + ",\n" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryDomain that = (DictionaryDomain) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(schema, that.schema) &&
                Objects.equals(urn, that.urn) &&
                Objects.equals(name, that.name) &&
                isEntity == that.isEntity &&
                isSystem == that.isSystem &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(creatorClass, that.creatorClass) &&
                Objects.equals(description, that.description) &&
                groupId == that.groupId &&
                dataGroupId == that.dataGroupId &&
                adminGroupId == that.adminGroupId;
    }
}
