package PerformanceTests;

import DataHubAnnotations.Association;
import DataHubAnnotations.Association.AssociationTypes;
import DataHubAnnotations.Table;
import DataHubORM.DataHubException;
import DataHubORM.DataHubModel;

@Table
public class HTM8 extends DataHubModel<HTM8>{

	public HTM8() throws DataHubException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Association(associationType=AssociationTypes.BelongsTo)
	public HeavyTestModel ht;
}
