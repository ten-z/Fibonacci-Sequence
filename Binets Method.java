{\rtf1\ansi\ansicpg936\cocoartf1671\cocoasubrtf500
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww12600\viewh10200\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs28 \cf0 //
\f1 \'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd\'c1\'d0
\f0 --
\f1 \'be\'d8\'d5\'f3\'b7\'a8
\f0 \
public class Solution \{\
    public static void main(String []args) \{\
		//
\f1 \'be\'d8\'d5\'f3\'b7\'a8\'bd\'ab\'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd\'c1\'d0\'d7\'aa\'bb\'bb\'b3\'c9\'c7\'f3
\f0 q
\f1 \'b5\'c4
\f0 n-1
\f1 \'b4\'ce\'b7\'bd\'b5\'c4\'ce\'ca\'cc\'e2\'a1\'a3
\f0 \
		int[][] q = \{\{1, 1\}, \{1, 0\}\};\
		System.out.print(fibonacci(10, q));\
    \}\
	\
    public static int fibonacci(int n, int[][] q) \{\
        if(n<2)return n;\
		//
\f1 \'c7\'f3
\f0 n
\f1 \'b4\'ce\'b7\'bd\'b5\'c4\'b7\'bd\'b7\'a8
\f0 pow()
\f1 \'d3\'d0\'b6\'fe\'b7\'d6\'b7\'a8\'b5\'dd\'b9\'e9\'ba\'cd\'b6\'fe\'bd\'f8\'d6\'c6\'d6\'b8\'ca\'fd\'b2\'f0\'bd\'e2\'c1\'bd\'d6\'d6\'b7\'bd\'b7\'a8\'a3\'ac\'d5\'e2\'c0\'ef\'b7\'d6\'b1\'f0\'ca\'b5\'cf\'d6\'c1\'cb
\f0 \
        //int[][] res = powRecursion(n-1, q);\
	 int[][] res = powBinary(n-1, q);\
        return res[0][0];\
    \}\
	//
\f1 \'b5\'dd\'b9\'e9\'ca\'b5\'cf\'d6\'b5\'c4
\f0 pow()
\f1 \'a3\'ac\'c3\'bf\'b4\'ce\'bd\'ab\'d6\'b8\'ca\'fd\'b6\'fe\'b7\'d6
\f0 \
	public static int[][] powRecursion(int n, int[][] q) \{\
        if(n == 1)return q;\
		//
\f1 \'c3\'bf\'b4\'ce\'d6\'b8\'ca\'fd
\f0 /2\
        int[][] r = powRecursion(n>>1, q);\
		//
\f1 \'c6\'e6\'ca\'fd\'b5\'c4\'bb\'b0\'d2\'aa\'b6\'e0\'b3\'cb\'d2\'bb\'b8\'f6\'b5\'d7\'ca\'fd\'a3\'ac\'c5\'bc\'ca\'fd\'d4\'f2\'b2\'bb\'d3\'c3
\f0 \
        if ((n & 1) == 1)\{\
            return multiply(multiply(r,r), q);\
        \}else\{\
            return multiply(r,r);\
        \}\
    \}\
	//
\f1 \'b6\'fe\'bd\'f8\'d6\'c6\'d6\'b8\'ca\'fd\'b2\'f0\'bd\'e2
\f0 \
	public static int[][] powBinary(int n, int[][] a) \{\
		//
\f1 \'b3\'f5\'ca\'bc\'bb\'af\'be\'d8\'d5\'f3
\f0 \
        int[][] ret = \{\{1, 0\}, \{0, 1\}\};\
        while (n > 0) \{\
            if ((n & 1) == 1) \{\
				//
\f1 \'b6\'fe\'bd\'f8\'d6\'c6\'d6\'d0
\f0 1
\f1 \'b5\'c4\'ce\'bb\'d6\'c3\'d0\'e8\'d2\'aa\'b3\'cb\'c8\'eb\'bd\'e1\'b9\'fb\'a3\'ac\'c6\'e4\'bd\'e1\'b9\'fb\'b5\'c8\'d3\'da\'b5\'cd\'a3\'a8\'c7\'b0\'a3\'a9\'d2\'bb\'ce\'bb\'bd\'e1\'b9\'fb\'b5\'c4\'c6\'bd\'b7\'bd
\f0 \
                ret = multiply(ret, a);\
            \}\
			//
\f1 \'d3\'d2\'d2\'c6\'a3\'ac\'bf\'b4\'b6\'fe\'bd\'f8\'d6\'c6\'d6\'b8\'ca\'fd\'b8\'df\'d2\'bb\'ce\'bb\'ca\'c7\'b7\'f1\'ce\'aa
\f0 1\
            n >>= 1;\
			//
\f1 \'ce\'de\'c2\'db\'b8\'df\'d2\'bb\'ce\'bb\'ca\'c7\'b7\'f1\'ce\'aa
\f0 1
\f1 \'a3\'ac\'b6\'bc\'cf\'c8\'cb\'e3\'b3\'f6\'bd\'e1\'b9\'fb\'a3\'ac\'b5\'c8\'d3\'da\'b5\'b1\'c7\'b0\'bd\'e1\'b9\'fb\'b5\'c4\'c6\'bd\'b7\'bd
\f0 \
            a = multiply(a, a);\
        \}\
        return ret;\
\}\
\
	//
\f1 \'ca\'fd\'d7\'e9\'b3\'cb\'b7\'a8\'b5\'c4\'ca\'b5\'cf\'d6
\f0 \
    public static int[][] multiply(int[][] a, int[][] b) \{\
        int[][] c = new int[2][2];\
        for (int i = 0; i < 2; i++) \{\
            for (int j = 0; j < 2; j++) \{\
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];\
            \}\
        \}\
        return c;\
    \}\
\
\}}