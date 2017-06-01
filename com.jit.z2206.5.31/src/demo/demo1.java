package demo;


	/*
	 * 更新是什么表？
	 * 更新的是那张表的哪个字段？
	 * 获取原数据与现有（输入）数据作比较
	 * 1. 找到更新的数据对象与查询出的集合对象中是否包含更新对象。 
	 * 2. 比较输入对象的字段列与原有数据的字段列是否相等。
	 * 3. 如果不等---》生成 sql  reflect
	 * 4. 数据插入。
	 */
	
	public Object compareColumn(List<Object> lists,Object obj){
		/*Iterator<Object> its = lists.iterator();
		while(its.hasNext()){
			Object o= its.next();
			o.equals(obj);							//Comparable Comparator
			
			//Collections.sort(list, c);
		}*/
		Customer cu = new Customer();
		String str= "";
		Field [] fieldNames = cu.getClass().getDeclaredFields();
		for(Field s:fieldNames){
			str +=s.getName();
		}
		System.out.println(str);
		return null;
	}
	
	public static void main(String[] args) {
		new UpdateUtil().compareColumn(null, null);
		String sql="update customer set salary=?";
	}

	}
	
