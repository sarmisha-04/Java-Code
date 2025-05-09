import java.util.Scanner;
import java.util.Random;

class node
{
node prev;
int data;
node next;

node (int data )
{
this.data = data;
prev = null;
next = null;

}

}
class dll
{
node start;
node last;
int number\_of\_nodes;


	dll ()
	{
       start = null;
	   last = null;
	   number_of_nodes  = 0;
	}
	void add( int value )
	{
	    node nn = new node (  value );
		number_of_nodes += 1;
		if ( start == null )
		{
		 start = nn;
		 last = nn;
		 number_of_nodes = 1;
		 return;
		}
		node tptr;
		for( tptr = start; tptr != null && nn.data > tptr.data; tptr=tptr.next);
		// start
		if ( tptr == start )
		{
		   nn.next = start;
		   start.prev = nn;
		   start = nn;

		}
		// mid
		else if ( tptr != null )
		{
		    nn.next = tptr;
			nn.prev = tptr.prev;
			tptr.prev.next = nn;
			tptr.prev = nn;
		}
		
		// last
		else
		{
		     last.next = nn;
			 nn.prev = last;
			 last = nn;
		}
	}
	void del( int delValue )
	{
		// write code here
		// 12:52 to 1:10
		// 1	2	3	4	5	6	7
		// a	b	c	d	e	f	g
		//              ^
		//      tptr.prev.next = tptr.next
		//      tptr.next.prev = tptr.prev
		//
		//     start = start.next 
		//     start.prev = null
		//     
		//      last = last.prev
		//      last.next = null;
		node tptr;
		if ( start == null )
		{
			return;
		}
		for( tptr = start ; tptr != null && tptr.data 	< delValue ; tptr = tptr.next);
        // node not found

       if ( tptr == null || tptr.data > delValue )
	   {
		   System.out.print("Value Not Found!!!!!!\n");
		   return;
	   }
	   if ( tptr == start )
	   {
		    start = start.next;
			start.prev = null;
	   } else if ( tptr == last )
	   {
		   last = last.prev;
		   last.next = null;
	   }
	   else 
	   {
		      tptr.prev.next = tptr.next;
			  tptr.next.prev = tptr.prev;
	   }
	   number_of_nodes -= 1;
	   
	}
	void printForward()
	{
	  node tptr;
	  for( tptr = start; tptr != null; tptr = tptr.next)
	  {
	     System.out.printf("%d ", tptr.data);
	  }
	  System.out.println();
	  
	}

	void printBackward()
	{
	  node tptr;
	  for( tptr = last; tptr != null; tptr = tptr.prev)
	  {
	     System.out.printf("%d ", tptr.data);
	  }
	  System.out.println();
	  
	}


}

class dll\_user
{
public static void main(String \[] args)
{
Scanner kbd = new Scanner ( System.in );
dll cse\_list = new dll ();
int noe;
noe = kbd.nextInt();
int iter;
Random rnd = new Random();
for( iter = 0; iter < noe; iter +=1 )
{
cse\_list.add(rnd.nextInt(100));
}
cse\_list.printForward();
cse\_list.printBackward();
int delValue;
delValue = kbd.nextInt();
cse\_list.del( delValue );
cse\_list.printForward();
delValue = kbd.nextInt();
cse\_list.del( delValue );
cse\_list.printForward();
delValue = kbd.nextInt();
cse\_list.del( delValue );
cse\_list.printForward();
dll newList = cse\_list;
System.out.printf("after\n\n\n\n");
newList.printForward();


 }


}
change the variables
