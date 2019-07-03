{\rtf1\ansi\ansicpg936\cocoartf1671\cocoasubrtf500
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww12600\viewh10200\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs28 \cf0 //
\f1 \'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd\'c1\'d0
\f0 --
\f1 \'b6\'af\'cc\'ac\'b9\'e6\'bb\'ae
\f0 \
public class Solution \{\
    public static void main(String []args) \{\
		System.out.print(fibonacciDynamic(10));\
    \}\
	//
\f1 \'d3\'c3\'d1\'ad\'bb\'b7\'b4\'fa\'cc\'e6\'b5\'dd\'b9\'e9\'cb\'bc\'c2\'b7\'a3\'ac\'b4\'d3
\f0 memo[2]
\f1 \'c7\'f3\'d6\'c1
\f0 memo[n]\
    public static int fibonacciDynamic(int n) \{\
        if (n < 2) \{\
            return n;\
        \}\
		//
\f1 \'b3\'f5\'ca\'bc\'bb\'af
\f0 memo
\f1 \'ca\'fd\'d7\'e9
\f0 ,
\f1 \'b4\'d3
\f0 1
\f1 \'a1\'ab
\f0 n
\f1 \'a3\'ac\'cb\'f9\'d2\'d4\'b3\'a4\'b6\'c8\'ce\'aa
\f0 n+1\
        int[] memo = new int[n + 1];\
		//
\f1 \'d2\'d1\'d6\'aa\'b5\'c4
\f0 0
\f1 \'ba\'cd
\f0 1
\f1 \'ce\'bb\'d6\'c3\'b5\'c4\'d6\'b5\'a3\'ac\'b4\'fa\'cc\'e6\'b5\'dd\'b9\'e9\'d6\'d5\'d6\'b9\'cc\'f5\'bc\'fe\'a1\'a3
\f0 \
        memo[0] = 0;\
        memo[1] = 1;\
		\
        for (int i = 2; i <= n; i++) \{\
            memo[i] = memo[i - 1] + memo[i - 2];\
        \}\
		//memo[n]
\f1 \'bc\'b4
\f0 f(n)
\f1 \'b5\'c4\'d6\'b5
\f0 \
        return memo[n];\
    \}\
\}}