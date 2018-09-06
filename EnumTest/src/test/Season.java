package test;

public enum Season {
	
	SPRING{
		@Override
		public String getDesc() {
			return "春天";
		}
	},
	SUMMER{
		@Override
		public String getDesc() {
			return "夏天";
		}
	},	
	AUTUMN{
		@Override
		public String getDesc() {
			return "秋天";
		}
	},
	WINTER{
		@Override
		public String getDesc() {
			return "冬天";
		}
	};
	/**
	 * 抽象方法，每一个都需要实现，用来返回不同的个体返回不同的中文
	 * @return
	 */
	public abstract String getDesc();
}
