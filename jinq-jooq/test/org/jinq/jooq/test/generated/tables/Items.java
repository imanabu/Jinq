/**
 * This class is generated by jOOQ
 */
package org.jinq.jooq.test.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Items extends org.jooq.impl.TableImpl<org.jinq.jooq.test.generated.tables.records.ItemsRecord> {

	private static final long serialVersionUID = 1159416119;

	/**
	 * The singleton instance of <code>APP.ITEMS</code>
	 */
	public static final org.jinq.jooq.test.generated.tables.Items ITEMS = new org.jinq.jooq.test.generated.tables.Items();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jinq.jooq.test.generated.tables.records.ItemsRecord> getRecordType() {
		return org.jinq.jooq.test.generated.tables.records.ItemsRecord.class;
	}

	/**
	 * The column <code>APP.ITEMS.ITEMID</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.ItemsRecord, java.lang.Integer> ITEMID = createField("ITEMID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>APP.ITEMS.NAME</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.ItemsRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>APP.ITEMS.SALEPRICE</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.ItemsRecord, java.lang.Integer> SALEPRICE = createField("SALEPRICE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>APP.ITEMS.PURCHASEPRICE</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.ItemsRecord, java.lang.Integer> PURCHASEPRICE = createField("PURCHASEPRICE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>APP.ITEMS</code> table reference
	 */
	public Items() {
		this("ITEMS", null);
	}

	/**
	 * Create an aliased <code>APP.ITEMS</code> table reference
	 */
	public Items(java.lang.String alias) {
		this(alias, org.jinq.jooq.test.generated.tables.Items.ITEMS);
	}

	private Items(java.lang.String alias, org.jooq.Table<org.jinq.jooq.test.generated.tables.records.ItemsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Items(java.lang.String alias, org.jooq.Table<org.jinq.jooq.test.generated.tables.records.ItemsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jinq.jooq.test.generated.App.APP, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jinq.jooq.test.generated.tables.records.ItemsRecord> getPrimaryKey() {
		return org.jinq.jooq.test.generated.Keys.SQL140601153102700;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jinq.jooq.test.generated.tables.records.ItemsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jinq.jooq.test.generated.tables.records.ItemsRecord>>asList(org.jinq.jooq.test.generated.Keys.SQL140601153102700);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jinq.jooq.test.generated.tables.Items as(java.lang.String alias) {
		return new org.jinq.jooq.test.generated.tables.Items(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jinq.jooq.test.generated.tables.Items rename(java.lang.String name) {
		return new org.jinq.jooq.test.generated.tables.Items(name, null);
	}
}
