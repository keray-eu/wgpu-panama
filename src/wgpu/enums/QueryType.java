package wgpu.enums;

import wgpu.CEnum;
import java.util.*;

public class QueryType extends CEnum {
	private static final Map<Integer, QueryType> map = new HashMap<>();
	public static final QueryType OCCLUSION = new QueryType(0x00000000, "Occlusion");
	public static final QueryType TIMESTAMP = new QueryType(0x00000001, "Timestamp");
	public static final QueryType PIPELINE_STATISTICS = new QueryType(0x00030000, "PipelineStatistics");

	public static QueryType from(int bits) {
		return map.get(bits);
	}

	private QueryType(int bits, String name) {
		super(bits, name);
		map.put(bits, this);
	}
}
