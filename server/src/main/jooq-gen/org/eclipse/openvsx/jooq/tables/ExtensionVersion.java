/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.eclipse.openvsx.jooq.Indexes;
import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.ExtensionVersionRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExtensionVersion extends TableImpl<ExtensionVersionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.extension_version</code>
     */
    public static final ExtensionVersion EXTENSION_VERSION = new ExtensionVersion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExtensionVersionRecord> getRecordType() {
        return ExtensionVersionRecord.class;
    }

    /**
     * The column <code>public.extension_version.id</code>.
     */
    public final TableField<ExtensionVersionRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.extension_version.bugs</code>.
     */
    public final TableField<ExtensionVersionRecord, String> BUGS = createField(DSL.name("bugs"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.description</code>.
     */
    public final TableField<ExtensionVersionRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.extension_version.display_name</code>.
     */
    public final TableField<ExtensionVersionRecord, String> DISPLAY_NAME = createField(DSL.name("display_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.gallery_color</code>.
     */
    public final TableField<ExtensionVersionRecord, String> GALLERY_COLOR = createField(DSL.name("gallery_color"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>public.extension_version.gallery_theme</code>.
     */
    public final TableField<ExtensionVersionRecord, String> GALLERY_THEME = createField(DSL.name("gallery_theme"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>public.extension_version.homepage</code>.
     */
    public final TableField<ExtensionVersionRecord, String> HOMEPAGE = createField(DSL.name("homepage"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.license</code>.
     */
    public final TableField<ExtensionVersionRecord, String> LICENSE = createField(DSL.name("license"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.markdown</code>.
     */
    public final TableField<ExtensionVersionRecord, String> MARKDOWN = createField(DSL.name("markdown"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>public.extension_version.preview</code>.
     */
    public final TableField<ExtensionVersionRecord, Boolean> PREVIEW = createField(DSL.name("preview"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.extension_version.qna</code>.
     */
    public final TableField<ExtensionVersionRecord, String> QNA = createField(DSL.name("qna"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.repository</code>.
     */
    public final TableField<ExtensionVersionRecord, String> REPOSITORY = createField(DSL.name("repository"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.timestamp</code>.
     */
    public final TableField<ExtensionVersionRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.extension_version.version</code>.
     */
    public final TableField<ExtensionVersionRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.extension_id</code>.
     */
    public final TableField<ExtensionVersionRecord, Long> EXTENSION_ID = createField(DSL.name("extension_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.extension_version.published_with_id</code>.
     */
    public final TableField<ExtensionVersionRecord, Long> PUBLISHED_WITH_ID = createField(DSL.name("published_with_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.extension_version.active</code>.
     */
    public final TableField<ExtensionVersionRecord, Boolean> ACTIVE = createField(DSL.name("active"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.extension_version.dependencies</code>.
     */
    public final TableField<ExtensionVersionRecord, String> DEPENDENCIES = createField(DSL.name("dependencies"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.extension_version.bundled_extensions</code>.
     */
    public final TableField<ExtensionVersionRecord, String> BUNDLED_EXTENSIONS = createField(DSL.name("bundled_extensions"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.extension_version.engines</code>.
     */
    public final TableField<ExtensionVersionRecord, String> ENGINES = createField(DSL.name("engines"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.extension_version.categories</code>.
     */
    public final TableField<ExtensionVersionRecord, String> CATEGORIES = createField(DSL.name("categories"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.extension_version.tags</code>.
     */
    public final TableField<ExtensionVersionRecord, String> TAGS = createField(DSL.name("tags"), SQLDataType.VARCHAR(16384), this, "");

    /**
     * The column <code>public.extension_version.extension_kind</code>.
     */
    public final TableField<ExtensionVersionRecord, String> EXTENSION_KIND = createField(DSL.name("extension_kind"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.pre_release</code>.
     */
    public final TableField<ExtensionVersionRecord, Boolean> PRE_RELEASE = createField(DSL.name("pre_release"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.extension_version.target_platform</code>.
     */
    public final TableField<ExtensionVersionRecord, String> TARGET_PLATFORM = createField(DSL.name("target_platform"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.extension_version.localized_languages</code>.
     */
    public final TableField<ExtensionVersionRecord, String> LOCALIZED_LANGUAGES = createField(DSL.name("localized_languages"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.sponsor_link</code>.
     */
    public final TableField<ExtensionVersionRecord, String> SPONSOR_LINK = createField(DSL.name("sponsor_link"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.extension_version.signature_key_pair_id</code>.
     */
    public final TableField<ExtensionVersionRecord, Long> SIGNATURE_KEY_PAIR_ID = createField(DSL.name("signature_key_pair_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.extension_version.semver_major</code>.
     */
    public final TableField<ExtensionVersionRecord, Integer> SEMVER_MAJOR = createField(DSL.name("semver_major"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.extension_version.semver_minor</code>.
     */
    public final TableField<ExtensionVersionRecord, Integer> SEMVER_MINOR = createField(DSL.name("semver_minor"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.extension_version.semver_patch</code>.
     */
    public final TableField<ExtensionVersionRecord, Integer> SEMVER_PATCH = createField(DSL.name("semver_patch"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.extension_version.semver_pre_release</code>.
     */
    public final TableField<ExtensionVersionRecord, String> SEMVER_PRE_RELEASE = createField(DSL.name("semver_pre_release"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.extension_version.semver_is_pre_release</code>.
     */
    public final TableField<ExtensionVersionRecord, Boolean> SEMVER_IS_PRE_RELEASE = createField(DSL.name("semver_is_pre_release"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.extension_version.semver_build_metadata</code>.
     */
    public final TableField<ExtensionVersionRecord, String> SEMVER_BUILD_METADATA = createField(DSL.name("semver_build_metadata"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>public.extension_version.universal_target_platform</code>.
     */
    public final TableField<ExtensionVersionRecord, Boolean> UNIVERSAL_TARGET_PLATFORM = createField(DSL.name("universal_target_platform"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>publc.extension_version.potentially_malicious</code>.
     */
    public final TableField<ExtensionVersionRecord, Boolean> POTENTIALLY_MALICIOUS = createField(DSL.name("potentially_malicious"), SQLDataType.BOOLEAN, this, "");

    private ExtensionVersion(Name alias, Table<ExtensionVersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExtensionVersion(Name alias, Table<ExtensionVersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.extension_version</code> table reference
     */
    public ExtensionVersion(String alias) {
        this(DSL.name(alias), EXTENSION_VERSION);
    }

    /**
     * Create an aliased <code>public.extension_version</code> table reference
     */
    public ExtensionVersion(Name alias) {
        this(alias, EXTENSION_VERSION);
    }

    /**
     * Create a <code>public.extension_version</code> table reference
     */
    public ExtensionVersion() {
        this(DSL.name("extension_version"), null);
    }

    public <O extends Record> ExtensionVersion(Table<O> child, ForeignKey<O, ExtensionVersionRecord> key) {
        super(child, key, EXTENSION_VERSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.EXTENSION_VERSION__EXTENSION_ID__IDX, Indexes.EXTENSION_VERSION__PUBLISHED_WITH_ID__IDX, Indexes.EXTENSION_VERSION_BY_TARGET_PLATFORM_ORDER_BY_IDX, Indexes.EXTENSION_VERSION_LATEST_ORDER_BY_IDX, Indexes.EXTENSION_VERSION_ORDER_BY_IDX, Indexes.EXTENSION_VERSION_VERSION_LIST_ORDER_BY_IDX, Indexes.EXTENSION_VERSION_VERSION_MAP_ORDER_BY_IDX);
    }

    @Override
    public UniqueKey<ExtensionVersionRecord> getPrimaryKey() {
        return Keys.EXTENSION_VERSION_PKEY;
    }

    @Override
    public List<UniqueKey<ExtensionVersionRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_EXTENSION_VERSION);
    }

    @Override
    public List<ForeignKey<ExtensionVersionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.EXTENSION_VERSION__FKKHS1EC9S9J08FGICQ9PMWU6BT, Keys.EXTENSION_VERSION__FK70KHJ8PM0VACASUIIAQ0W0R80, Keys.EXTENSION_VERSION__EXTENSION_VERSION_SIGNATURE_KEY_PAIR_FKEY);
    }

    private transient Extension _extension;
    private transient PersonalAccessToken _personalAccessToken;
    private transient SignatureKeyPair _signatureKeyPair;

    /**
     * Get the implicit join path to the <code>public.extension</code> table.
     */
    public Extension extension() {
        if (_extension == null)
            _extension = new Extension(this, Keys.EXTENSION_VERSION__FKKHS1EC9S9J08FGICQ9PMWU6BT);

        return _extension;
    }

    /**
     * Get the implicit join path to the
     * <code>public.personal_access_token</code> table.
     */
    public PersonalAccessToken personalAccessToken() {
        if (_personalAccessToken == null)
            _personalAccessToken = new PersonalAccessToken(this, Keys.EXTENSION_VERSION__FK70KHJ8PM0VACASUIIAQ0W0R80);

        return _personalAccessToken;
    }

    /**
     * Get the implicit join path to the <code>public.signature_key_pair</code>
     * table.
     */
    public SignatureKeyPair signatureKeyPair() {
        if (_signatureKeyPair == null)
            _signatureKeyPair = new SignatureKeyPair(this, Keys.EXTENSION_VERSION__EXTENSION_VERSION_SIGNATURE_KEY_PAIR_FKEY);

        return _signatureKeyPair;
    }

    @Override
    public ExtensionVersion as(String alias) {
        return new ExtensionVersion(DSL.name(alias), this);
    }

    @Override
    public ExtensionVersion as(Name alias) {
        return new ExtensionVersion(alias, this);
    }

    @Override
    public ExtensionVersion as(Table<?> alias) {
        return new ExtensionVersion(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExtensionVersion rename(String name) {
        return new ExtensionVersion(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExtensionVersion rename(Name name) {
        return new ExtensionVersion(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExtensionVersion rename(Table<?> name) {
        return new ExtensionVersion(name.getQualifiedName(), null);
    }
}
