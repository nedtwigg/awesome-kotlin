/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.time.OffsetDateTime

import kotlin.collections.Collection
import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.COMMENT_PKEY
import link.kotlin.server.jooq.main.keys.COMMENT__COMMENT_KOTLINER_ID_FKEY
import link.kotlin.server.jooq.main.keys.COMMENT__COMMENT_PARENT_ID_FKEY
import link.kotlin.server.jooq.main.tables.Comment.CommentPath
import link.kotlin.server.jooq.main.tables.Kotliner.KotlinerPath
import link.kotlin.server.jooq.main.tables.records.CommentRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Comment(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CommentRecord>?,
    parentPath: InverseForeignKey<out Record, CommentRecord>?,
    aliased: Table<CommentRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CommentRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.comment</code>
         */
        val COMMENT: Comment = Comment()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CommentRecord> = CommentRecord::class.java

    /**
     * The column <code>public.comment.id</code>.
     */
    val ID: TableField<CommentRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.comment.parent_id</code>.
     */
    val PARENT_ID: TableField<CommentRecord, Long?> = createField(DSL.name("parent_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.comment.kotliner_id</code>.
     */
    val KOTLINER_ID: TableField<CommentRecord, Long?> = createField(DSL.name("kotliner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.comment.content</code>.
     */
    val CONTENT: TableField<CommentRecord, String?> = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.comment.created</code>.
     */
    val CREATED: TableField<CommentRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.comment.updated</code>.
     */
    val UPDATED: TableField<CommentRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.comment.version</code>.
     */
    val VERSION: TableField<CommentRecord, Long?> = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), this, "")

    private constructor(alias: Name, aliased: Table<CommentRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CommentRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CommentRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.comment</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.comment</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.comment</code> table reference
     */
    constructor(): this(DSL.name("comment"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CommentRecord>?, parentPath: InverseForeignKey<out Record, CommentRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, COMMENT, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class CommentPath : Comment, Path<CommentRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CommentRecord>?, parentPath: InverseForeignKey<out Record, CommentRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<CommentRecord>): super(alias, aliased)
        override fun `as`(alias: String): CommentPath = CommentPath(DSL.name(alias), this)
        override fun `as`(alias: Name): CommentPath = CommentPath(alias, this)
        override fun `as`(alias: Table<*>): CommentPath = CommentPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CommentRecord, Long?> = super.getIdentity() as Identity<CommentRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CommentRecord> = COMMENT_PKEY
    override fun getReferences(): List<ForeignKey<CommentRecord, *>> = listOf(COMMENT__COMMENT_PARENT_ID_FKEY, COMMENT__COMMENT_KOTLINER_ID_FKEY)

    private lateinit var _comment: CommentPath

    /**
     * Get the implicit join path to the <code>public.comment</code> table.
     */
    fun comment(): CommentPath {
        if (!this::_comment.isInitialized)
            _comment = CommentPath(this, COMMENT__COMMENT_PARENT_ID_FKEY, null)

        return _comment;
    }

    val comment: CommentPath
        get(): CommentPath = comment()

    private lateinit var _kotliner: KotlinerPath

    /**
     * Get the implicit join path to the <code>public.kotliner</code> table.
     */
    fun kotliner(): KotlinerPath {
        if (!this::_kotliner.isInitialized)
            _kotliner = KotlinerPath(this, COMMENT__COMMENT_KOTLINER_ID_FKEY, null)

        return _kotliner;
    }

    val kotliner: KotlinerPath
        get(): KotlinerPath = kotliner()
    override fun `as`(alias: String): Comment = Comment(DSL.name(alias), this)
    override fun `as`(alias: Name): Comment = Comment(alias, this)
    override fun `as`(alias: Table<*>): Comment = Comment(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Comment = Comment(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Comment = Comment(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Comment = Comment(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): Comment = Comment(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Comment = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): Comment = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): Comment = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Comment = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Comment = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Comment = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Comment = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Comment = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Comment = where(DSL.notExists(select))
}
