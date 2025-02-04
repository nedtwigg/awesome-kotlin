/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.records


import java.time.OffsetDateTime

import link.kotlin.server.jooq.main.tables.LibraryVersion

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class LibraryVersionRecord() : UpdatableRecordImpl<LibraryVersionRecord>(LibraryVersion.LIBRARY_VERSION) {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var libraryId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var groupId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var artifactId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var version: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var created: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var updated: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised LibraryVersionRecord
     */
    constructor(id: Long? = null, libraryId: Long? = null, groupId: String? = null, artifactId: String? = null, version: String? = null, created: OffsetDateTime? = null, updated: OffsetDateTime? = null): this() {
        this.id = id
        this.libraryId = libraryId
        this.groupId = groupId
        this.artifactId = artifactId
        this.version = version
        this.created = created
        this.updated = updated
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised LibraryVersionRecord
     */
    constructor(value: link.kotlin.server.jooq.main.tables.pojos.LibraryVersion?): this() {
        if (value != null) {
            this.id = value.id
            this.libraryId = value.libraryId
            this.groupId = value.groupId
            this.artifactId = value.artifactId
            this.version = value.version
            this.created = value.created
            this.updated = value.updated
            resetChangedOnNotNull()
        }
    }
}
