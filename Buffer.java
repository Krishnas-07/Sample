class Buffer
{
static StringBuffer c,d,f,g,h;
public static void main(String args[])
{
StringBuffer a=new StringBuffer("Krishna");
StringBuffer b=new StringBuffer("India was my country");
c=a.append("Priya");// to add details
System.out.println(c);

d=a.insert(7," " );// to insert string
System.out.println(d);

f=b.replace(6,9,"is");//excluding last index 
System.out.println(f);

g=b.delete(9,12);// to delete 
System.out.println(g);

h=b.reverse();//reverse the string
System.out.println(h);
}}

