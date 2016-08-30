///1.1 Implement an algorithm to determine if a string has all unique characters. 
//Whatif you cannot use additional data structures?

class AS_1_1 
{
	 boolean isUnique(String s) 
	{
		if (s==null||s.length()==1)
		{
			return true;
		}
		HashSet<Character> res=new HashSet<Character>();
		for(int index=0;index<s.length();index++)
		{
			if (!res.add(s.charAt(index)))
			//haseset 添加内容为add(Obj obj)返回boolean值，能添加返回true，已有返回false
			{	return false;}
		}
		return true;
	}
}
//不考虑ASCII编码之类，用hashset来存储，遇到same charater报否；Tine 0(n),  Space 0(1).

class AS_1_1 {
	 boolean isUnique(String s) 
	{
		 if(s.length()>256)
		 {return false;}
		 boolean[] res=new boolean[256];
		 for(int i=0;i<s.length();i++)
		 {
			 int v=s.charAt(i);
			 //ASCII转换成对应int值
			 if(res[v])
			 {return false;}
			 res[v]=true;
		 }
		 return true;
	}
	}
	//考虑ASCII码, size最大为256.建boolean[256]标为判断标志位。Tine 0(n),  Space 0(1).
	
	class AS_1_1 {
	 boolean isUnique(String s) 
	{
		 int checker=0;
		 for(int i=0;i<s.length();i++)
		 {
		    int val=s.charAt(i)-'a';
		    if((checker&(1<<val))>0)
		      {return false;}
		    checker|=(1<<val);
		    //checker=checker|(1<<val);
		 }
		 return true;
	}
	//进一步限制条件在a到z之间。利用bit位来作为Boolean标志位。只需26个bit位来表示
/*Alternatively, we could do the following:
1. Compare every character of the string to every other character of the string. This will
takeO(n2) time and 0(1) space.
2. If we are allowed to modify the input string, we could sort the string in 0(n log(n))
time and then linearly check the string for neighboring characters that are identical.
Careful, though: many sorting algorithms take up extra space.
*/
