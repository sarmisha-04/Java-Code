// class node
class node
{
int data;
node next ;


node ( int data )
{
   this.data = data;
   next = null;
}


}

class sll
{
node start;
node last;
int number\_of\_nodes;


  sll () 
  {
    start = null;
	last = null;
	number_of_nodes = 0;
  }
  
  void append ( int value )
  {
     node  nn = new node ( value );
	 // list is empty
	 
	 if ( start == null )
	 {
	     start = nn;
		 last = nn;
		 number_of_nodes = 1;
		 return;
	 }
	 last.next = nn;
	 last = nn;
	 number_of_nodes += 1;
  }
  
  void insertAt ( int pos, int value )
  {
     node  nn = new node ( value );
	 // list is empty
	 if ( start == null )
	 {
	    start = nn;
		last = nn;
		number_of_nodes = 1;
		return;
	 }
	 // pos not valid
	 if ( pos >= number_of_nodes )
	 {
	    last.next = nn;
		last  = nn;
		number_of_nodes += 1;
		return;
	 }
	 if ( pos == 0 )
	 {
		nn.next = start;
		start = nn;
		number_of_nodes += 1;
		return;
	 }
	 int ind;
	 node tptr;
	 for( ind = 0, tptr = start; ind < pos-1 ; ind+=1, tptr = tptr.next);
	 nn.next = tptr.next;
	 tptr.next = nn;
	 number_of_nodes += 1;
  }
  void delete ( int delVal) {
	  if ( start == null ) 
		  return;
	  node curr = null;
	  node prev = null;
	  
	  for( curr = start; curr != null && curr.data != delVal; prev = curr, curr = curr.next);
	  if ( curr == null )
	  {
		  System.out.printf("Value Not Found!!!!!!");
		  return;
	  }
	  // start
	  if ( prev == null )
	  {
		  start = start.next;
		  number_of_nodes-=1;
		  if ( start == null) 
			  last = null;
		  return;
	  }			 
    // middle and last 
	   prev.next = curr.next;
	   
	   if ( curr==last)
		   last = prev;
	   
	   number_of_nodes-=1;
    
	  
  }		  

  
  
  void print()
  {
     node tptr;
	 for( tptr = start; tptr != null; tptr = tptr.next)
	 {
	   System.out.printf("%d ", tptr.data);
	 }
	 System.out.printf("\n");
  }
  void reverse()
  {
	  node ourPrev = null;
	  node ourCurr = null;
	  node ourNext = null;
	  
	  // init
	  
	  ourCurr = start;
	  ourNext = start.next;
	  
	  // loop
	  
	  while ( ourCurr != null )
	  {
		  ourCurr.next = ourPrev;
		  ourPrev = ourCurr;
		  ourCurr = ourNext;
	      if ( ourNext != null )
     	  ourNext = ourNext.next;
	  }
	 
	    node temp;
    temp = start;
    start = last;
    last = temp;		
	  // stabilise
  }


}

class sll\_working
{
public static void main(String \[] args)
{
sll cse\_list1 = new sll();
cse\_list1.append ( 32 );
cse\_list1.append ( 16 );
cse\_list1.append ( 17 );
cse\_list1.append ( 20 );
cse\_list1.append ( 39 );
cse\_list1.print();
cse\_list1.insertAt(3, 33);
cse\_list1.print();
cse\_list1.insertAt(0,0);
cse\_list1.print();
cse\_list1.insertAt(70, 70);
cse\_list1.print();
cse\_list1.delete( 20 );
cse\_list1.print();
cse\_list1.delete( 0 );
cse\_list1.print();
cse\_list1.delete( 70 );
cse\_list1.print();
cse\_list1.delete( 20 );
cse\_list1.print();
cse\_list1.reverse();
cse\_list1.print();


 }


}

change the variable names
