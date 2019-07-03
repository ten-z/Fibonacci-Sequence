{\rtf1\ansi\ansicpg936\cocoartf1671\cocoasubrtf500
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww12600\viewh10200\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs28 \cf0 //
\f1 \'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd\'c1\'d0
\f0 --
\f1 \'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd
\f0 \
public class Solution \{\
    public static void main(String []args) \{\
		System.out.print(fibonacciNumber(10));\
    \}\
	//
\f1 \'d3\'c3\'c1\'bd\'b8\'f6
\f0 int
\f1 \'b4\'e6\'b4\'a2\'b4\'fa\'cc\'e6
\f0 memo
\f1 \'ca\'fd\'d7\'e9
\f0 \
    public static int fibonacciNumber(int n) \{\
        if (n < 2) \{\
            return n;\
        \}\
		//
\f1 \'d3\'c3
\f0 first
\f1 \'ba\'cd
\f0 second
\f1 \'b4\'e6\'b4\'a2\'c3\'bf\'b4\'ce\'b5\'c4
\f0 memo[n-1]
\f1 \'ba\'cd
\f0 memo[n-2],
\f1 \'b2\'bb\'b6\'cf\'b8\'fc\'d0\'c2
\f0 first
\f1 \'ba\'cd
\f0 second
\f1 \'b5\'c4\'d6\'b5\'a3\'ac\'b4\'fa\'cc\'e6
\f0 memo
\f1 \'ca\'fd\'d7\'e9
\f0 \
        int first = 0;\
        int second = 1;\
        for (int i = 2; i <= n; i++) \{\
            int third = first + second;\
            first = second;\
            second = third;\
        \}\
		//
\f1 \'d7\'ee\'ba\'f3\'d2\'bb\'b4\'ce\'d1\'ad\'bb\'b7\'bd\'bb\'bb\'bb\'ba\'f3\'a3\'ac
\f0 f(n)==second\
        return second;\
    \}\
\}}