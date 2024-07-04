/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.ExtensionVersion;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExtensionVersionRecord extends UpdatableRecordImpl<ExtensionVersionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.extension_version.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.extension_version.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.extension_version.bugs</code>.
     */
    public void setBugs(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.extension_version.bugs</code>.
     */
    public String getBugs() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.extension_version.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.extension_version.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.extension_version.display_name</code>.
     */
    public void setDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.extension_version.display_name</code>.
     */
    public String getDisplayName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.extension_version.gallery_color</code>.
     */
    public void setGalleryColor(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.extension_version.gallery_color</code>.
     */
    public String getGalleryColor() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.extension_version.gallery_theme</code>.
     */
    public void setGalleryTheme(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.extension_version.gallery_theme</code>.
     */
    public String getGalleryTheme() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.extension_version.homepage</code>.
     */
    public void setHomepage(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.extension_version.homepage</code>.
     */
    public String getHomepage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.extension_version.license</code>.
     */
    public void setLicense(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.extension_version.license</code>.
     */
    public String getLicense() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.extension_version.markdown</code>.
     */
    public void setMarkdown(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.extension_version.markdown</code>.
     */
    public String getMarkdown() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.extension_version.preview</code>.
     */
    public void setPreview(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.extension_version.preview</code>.
     */
    public Boolean getPreview() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.extension_version.qna</code>.
     */
    public void setQna(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.extension_version.qna</code>.
     */
    public String getQna() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.extension_version.repository</code>.
     */
    public void setRepository(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.extension_version.repository</code>.
     */
    public String getRepository() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.extension_version.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.extension_version.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>public.extension_version.version</code>.
     */
    public void setVersion(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.extension_version.version</code>.
     */
    public String getVersion() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.extension_version.extension_id</code>.
     */
    public void setExtensionId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.extension_version.extension_id</code>.
     */
    public Long getExtensionId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.extension_version.published_with_id</code>.
     */
    public void setPublishedWithId(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.extension_version.published_with_id</code>.
     */
    public Long getPublishedWithId() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>public.extension_version.active</code>.
     */
    public void setActive(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.extension_version.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.extension_version.dependencies</code>.
     */
    public void setDependencies(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.extension_version.dependencies</code>.
     */
    public String getDependencies() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.extension_version.bundled_extensions</code>.
     */
    public void setBundledExtensions(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.extension_version.bundled_extensions</code>.
     */
    public String getBundledExtensions() {
        return (String) get(18);
    }

    /**
     * Setter for <code>public.extension_version.engines</code>.
     */
    public void setEngines(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.extension_version.engines</code>.
     */
    public String getEngines() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.extension_version.categories</code>.
     */
    public void setCategories(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.extension_version.categories</code>.
     */
    public String getCategories() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.extension_version.tags</code>.
     */
    public void setTags(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.extension_version.tags</code>.
     */
    public String getTags() {
        return (String) get(21);
    }

    /**
     * Setter for <code>public.extension_version.extension_kind</code>.
     */
    public void setExtensionKind(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.extension_version.extension_kind</code>.
     */
    public String getExtensionKind() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.extension_version.pre_release</code>.
     */
    public void setPreRelease(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.extension_version.pre_release</code>.
     */
    public Boolean getPreRelease() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>public.extension_version.target_platform</code>.
     */
    public void setTargetPlatform(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.extension_version.target_platform</code>.
     */
    public String getTargetPlatform() {
        return (String) get(24);
    }

    /**
     * Setter for <code>public.extension_version.localized_languages</code>.
     */
    public void setLocalizedLanguages(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.extension_version.localized_languages</code>.
     */
    public String getLocalizedLanguages() {
        return (String) get(25);
    }

    /**
     * Setter for <code>public.extension_version.sponsor_link</code>.
     */
    public void setSponsorLink(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.extension_version.sponsor_link</code>.
     */
    public String getSponsorLink() {
        return (String) get(26);
    }

    /**
     * Setter for <code>public.extension_version.signature_key_pair_id</code>.
     */
    public void setSignatureKeyPairId(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.extension_version.signature_key_pair_id</code>.
     */
    public Long getSignatureKeyPairId() {
        return (Long) get(27);
    }

    /**
     * Setter for <code>public.extension_version.semver_major</code>.
     */
    public void setSemverMajor(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.extension_version.semver_major</code>.
     */
    public Integer getSemverMajor() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>public.extension_version.semver_minor</code>.
     */
    public void setSemverMinor(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.extension_version.semver_minor</code>.
     */
    public Integer getSemverMinor() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>public.extension_version.semver_patch</code>.
     */
    public void setSemverPatch(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.extension_version.semver_patch</code>.
     */
    public Integer getSemverPatch() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>public.extension_version.semver_pre_release</code>.
     */
    public void setSemverPreRelease(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>public.extension_version.semver_pre_release</code>.
     */
    public String getSemverPreRelease() {
        return (String) get(31);
    }

    /**
     * Setter for <code>public.extension_version.semver_is_pre_release</code>.
     */
    public void setSemverIsPreRelease(Boolean value) {
        set(32, value);
    }

    /**
     * Getter for <code>public.extension_version.semver_is_pre_release</code>.
     */
    public Boolean getSemverIsPreRelease() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>public.extension_version.semver_build_metadata</code>.
     */
    public void setSemverBuildMetadata(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>public.extension_version.semver_build_metadata</code>.
     */
    public String getSemverBuildMetadata() {
        return (String) get(33);
    }

    /**
     * Setter for
     * <code>public.extension_version.universal_target_platform</code>.
     */
    public void setUniversalTargetPlatform(Boolean value) {
        set(34, value);
    }

    /**
     * Getter for
     * <code>public.extension_version.universal_target_platform</code>.
     */
    public Boolean getUniversalTargetPlatform() {
        return (Boolean) get(34);
    }

    /**
     * Setter for
     * <code>public.extension_version.potentially_malicious</code>.
     */
    public void setPotentiallyMalicious(Boolean value) {
        set(35, value);
    }

    /**
     * Getter for
     * <code>public.extension_version.potentially_malicious</code>.
     */
    public Boolean getPotentiallyMalicious() {
        return (Boolean) get(35);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExtensionVersionRecord
     */
    public ExtensionVersionRecord() {
        super(ExtensionVersion.EXTENSION_VERSION);
    }

    /**
     * Create a detached, initialised ExtensionVersionRecord
     */
    public ExtensionVersionRecord(Long id, String bugs, String description, String displayName, String galleryColor, String galleryTheme, String homepage, String license, String markdown, Boolean preview, String qna, String repository, LocalDateTime timestamp, String version, Long extensionId, Long publishedWithId, Boolean active, String dependencies, String bundledExtensions, String engines, String categories, String tags, String extensionKind, Boolean preRelease, String targetPlatform, String localizedLanguages, String sponsorLink, Long signatureKeyPairId, Integer semverMajor, Integer semverMinor, Integer semverPatch, String semverPreRelease, Boolean semverIsPreRelease, String semverBuildMetadata, Boolean universalTargetPlatform, Boolean potentiallyMalicious) {
        super(ExtensionVersion.EXTENSION_VERSION);

        setId(id);
        setBugs(bugs);
        setDescription(description);
        setDisplayName(displayName);
        setGalleryColor(galleryColor);
        setGalleryTheme(galleryTheme);
        setHomepage(homepage);
        setLicense(license);
        setMarkdown(markdown);
        setPreview(preview);
        setQna(qna);
        setRepository(repository);
        setTimestamp(timestamp);
        setVersion(version);
        setExtensionId(extensionId);
        setPublishedWithId(publishedWithId);
        setActive(active);
        setDependencies(dependencies);
        setBundledExtensions(bundledExtensions);
        setEngines(engines);
        setCategories(categories);
        setTags(tags);
        setExtensionKind(extensionKind);
        setPreRelease(preRelease);
        setTargetPlatform(targetPlatform);
        setLocalizedLanguages(localizedLanguages);
        setSponsorLink(sponsorLink);
        setSignatureKeyPairId(signatureKeyPairId);
        setSemverMajor(semverMajor);
        setSemverMinor(semverMinor);
        setSemverPatch(semverPatch);
        setSemverPreRelease(semverPreRelease);
        setSemverIsPreRelease(semverIsPreRelease);
        setSemverBuildMetadata(semverBuildMetadata);
        setUniversalTargetPlatform(universalTargetPlatform);
        setPotentiallyMalicious(potentiallyMalicious);
        resetChangedOnNotNull();
    }
}
