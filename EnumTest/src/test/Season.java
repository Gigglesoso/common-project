package test;

public enum Season {
	
	SPRING{
		@Override
		public String getDesc() {
			return "����";
		}
	},
	SUMMER{
		@Override
		public String getDesc() {
			return "����";
		}
	},	
	AUTUMN{
		@Override
		public String getDesc() {
			return "����";
		}
	},
	WINTER{
		@Override
		public String getDesc() {
			return "����";
		}
	};
	/**
	 * ���󷽷���ÿһ������Ҫʵ�֣��������ز�ͬ�ĸ��巵�ز�ͬ������
	 * @return
	 */
	public abstract String getDesc();
}
