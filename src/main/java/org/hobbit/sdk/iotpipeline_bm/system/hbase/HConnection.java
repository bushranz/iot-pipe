package org.hobbit.sdk.iotpipeline_bm.system.hbase;

/**
 * Created by bushranazir on 24.03.2019.
 */

public class HConnection {
		/*
	public static void main(String[] args) throws IOException {



		Configuration config = HBaseConfiguration.create();
		// Example of setting zookeeper values for HDInsight
		// in code instead of an hbase-site.xml file
		//
		// config.set("hbase.zookeeper.quorum",
		//            "zookeepernode0,zookeepernode1,zookeepernode2");
		//config.set("hbase.zookeeper.property.clientPort", "2181");
		//config.set("hbase.cluster.distributed", "true");
		//
		//NOTE: Actual zookeeper host names can be found using Ambari:
		//curl -u admin:PASSWORD -G "https://CLUSTERNAME.azurehdinsight.net/api/v1/clusters/CLUSTERNAME/hosts"

		//Linux-based HDInsight clusters use /hbase-unsecure as the znode parent
		config.set("zookeeper.znode.parent","/hbase-unsecure");

		// create an admin object using the config
		HBaseAdmin admin = new HBaseAdmin(config);

		// create the table...

		HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf("people"));
		// ... with two column families
		tableDescriptor.addFamily(new HColumnDescriptor("name"));
		tableDescriptor.addFamily(new HColumnDescriptor("contactinfo"));
		admin.createTable(tableDescriptor);

		// define some people
		String[][] people = {
				{ "1", "Marcel", "Haddad", "marcel@fabrikam.com"},
				{ "2", "Franklin", "Holtz", "franklin@contoso.com" },
				{ "3", "Dwayne", "McKee", "dwayne@fabrikam.com" },
				{ "4", "Rae", "Schroeder", "rae@contoso.com" },
				{ "5", "Rosalie", "burton", "rosalie@fabrikam.com"},
				{ "6", "Gabriela", "Ingram", "gabriela@contoso.com"} };

		HTable table = new HTable(config, "people");

		// Add each person to the table
		//   Use the `name` column family for the name
		//   Use the `contactinfo` column family for the email
		for (int i = 0; i< people.length; i++) {
			Put person = new Put(Bytes.toBytes(people[i][0]));
			person.add(Bytes.toBytes("name"), Bytes.toBytes("first"), Bytes.toBytes(people[i][1]));
			person.add(Bytes.toBytes("name"), Bytes.toBytes("last"), Bytes.toBytes(people[i][2]));
			person.add(Bytes.toBytes("contactinfo"), Bytes.toBytes("email"), Bytes.toBytes(people[i][3]));
			table.put(person);
		}
		// flush commits and close the table
		table.flushCommits();
		table.close();
	}

	*/
}


