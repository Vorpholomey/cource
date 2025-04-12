package Lession7.data_base;

import java.sql.Timestamp;
import java.util.Objects;

public class DictionaryMetadata {
    private long id;
    private DictionaryDomain domain;
    private String baseName;
    private String tableName;
    private String seqName;
    private String source;
    private String rawMetadata;
    private String metadata;
    private String code;
    private String urn;
    private String shortName;
    private Timestamp versionDate;
    private String version;
    private Timestamp creationDate;
    private Timestamp updateDate;
    private CreatorClass creator;
    private boolean external;
    private boolean privateField;
    private boolean latest;
    private PublishTypeEnum publishType;
    private boolean published;

    public DictionaryMetadata(long id, DictionaryDomain domain, String baseName, String tableName, String seqName,
                              String source, String rawMetadata, String metadata, String code, String urn,
                              String shortName, Timestamp versionDate, String version, Timestamp creationDate,
                              Timestamp updateDate, CreatorClass creator, boolean external, boolean privateField,
                              boolean latest, PublishTypeEnum publishType, boolean published) {
        this.id = id;
        this.domain = domain;
        this.baseName = baseName;
        this.tableName = tableName;
        this.seqName = seqName;
        this.source = source;
        this.rawMetadata = rawMetadata;
        this.metadata = metadata;
        this.code = code;
        this.urn = urn;
        this.shortName = shortName;
        this.versionDate = versionDate;
        this.version = version;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.creator = creator;
        this.external = external;
        this.privateField = privateField;
        this.latest = latest;
        this.publishType = publishType;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public DictionaryDomain getDomain() {
        return domain;
    }

    public String getBaseName() {
        return baseName;
    }

    public String getTableName() {
        return tableName;
    }

    public String getSeqName() {
        return seqName;
    }

    public String getSource() {
        return source;
    }

    public String getRawMetadata() {
        return rawMetadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public String getCode() {
        return code;
    }

    public String getUrn() {
        return urn;
    }

    public String getShortName() {
        return shortName;
    }

    public Timestamp getVersionDate() {
        return versionDate;
    }

    public String getVersion() {
        return version;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public CreatorClass getCreator() {
        return creator;
    }

    public boolean isExternal() {
        return external;
    }

    public boolean isPrivateField() {
        return privateField;
    }

    public boolean isLatest() {
        return latest;
    }

    public PublishTypeEnum getPublishType() {
        return publishType;
    }

    public boolean isPublished() {
        return published;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDomain(DictionaryDomain domain) {
        this.domain = domain;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setRawMetadata(String rawMetadata) {
        this.rawMetadata = rawMetadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setVersionDate(Timestamp versionDate) {
        this.versionDate = versionDate;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public void setCreator(CreatorClass creator) {
        this.creator = creator;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public void setPrivateField(boolean privateField) {
        this.privateField = privateField;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }

    public void setPublishType(PublishTypeEnum publishType) {
        this.publishType = publishType;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "DictionaryMetadata{" +
                " id=" + id + ",\n" +
                " domain=" + domain + ",\n" +
                " baseName='" + baseName + '\'' + ",\n" +
                " tableName='" + tableName + '\'' + ",\n" +
                " seqName='" + seqName + '\'' + ",\n" +
                " source='" + source + '\'' + ",\n" +
                " rawMetadata='" + rawMetadata + '\'' + ",\n" +
                " metadata='" + metadata + '\'' + ",\n" +
                " code='" + code + '\'' + ",\n" +
                " urn='" + urn + '\'' + ",\n" +
                " shortName='" + shortName + '\'' + ",\n" +
                " versionDate=" + versionDate + ",\n" +
                " version='" + version + '\'' + ",\n" +
                " creationDate=" + creationDate + ",\n" +
                " updateDate=" + updateDate + ",\n" +
                " creator=" + creator + ",\n" +
                " external=" + external + ",\n" +
                " privateField=" + privateField + ",\n" +
                " latest=" + latest + ",\n" +
                " publishType=" + publishType + ",\n" +
                " published=" + published + ",\n" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryMetadata that = (DictionaryMetadata) o;
        return id == that.id &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(seqName, that.seqName) &&
                Objects.equals(source, that.source) &&
                Objects.equals(rawMetadata, that.metadata) &&
                Objects.equals(code, that.code) &&
                Objects.equals(urn, that.urn) &&
                Objects.equals(shortName, that.shortName) &&
                Objects.equals(versionDate, that.versionDate) &&
                Objects.equals(version, that.version) &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(creator, that.creator) &&
                external == that.external &&
                privateField == that.privateField &&
                latest == that.latest &&
                Objects.equals(publishType, that.publishType) &&
                published == that.published;
    }
}
