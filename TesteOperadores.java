
 class TesteOperadores
	 {
		 public static void main(String []args)
		 {
			 int a, b=10, c=5, d=2, e=4, f=3, g=6, h=15;
			
			 a=b+c*d+e*f+h/g-f;
			 System.out.println("a= +a");
			 float i =125.0f, j=23.0f;
			 System.out.println((i/j));
			 System.out.println((double)i/j);
			 System.out.println(((double)i/j));
			 System.out.println((int)(i/j));
			 a=10; b=5; c=20;
			 d= ++a + b-- - c++;
			 System.out.println(a);
			 System.out.println(b);
			 System.out.println(c);
			 System.out.println(d);
			 int x=30, y=14, z=x--/++y, w=10*2++;
			 int k= --w%2; 
			 int r=1, m=2, t=1, n=2;
			 System.out.println("x=" + x);
			 System.out.println("y=" + y);
			 System.out.println("z=" + z);
			 System.out.println("w=" + w);
			 System.out.println("k=" + k);
			 b=x*y+2%4+ --c + w * r + m + n + t;
			 System.out.println(b);
			 b=x*(y+2)%4+ --c + w * (r + m)+ n + t;
			 System.out.println(b);
    	    	       }
	 }

