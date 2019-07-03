{\rtf1\ansi\ansicpg936\cocoartf1671\cocoasubrtf500
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww15480\viewh10200\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs28 \cf0 //
\f1 \'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd\'c1\'d0
\f0 --
\f1 \'b5\'dd\'b9\'e9
\f0 \
public class Solution \{\
    public static void main(String []args) \{\
		for(int i=1; i<10; i++)\{\
			System.out.print(fibonacci(i));\
			System.out.print(",");\
		\}\
    \}\
	//
\f1 \'ca\'e4\'c8\'eb
\f0 n
\f1 \'a3\'ac\'b7\'b5\'bb\'d8
\f0 f(n)\
	//
\f1 \'b8\'f9\'be\'dd\'b5\'dd\'b9\'e9\'b9\'d8\'cf\'b5\'ba\'cd\'d6\'d5\'d6\'b9\'cc\'f5\'bc\'fe\'ba\'dc\'c8\'dd\'d2\'d7\'d0\'b4\'b3\'f6\'b5\'dd\'b9\'e9\'c2\'df\'bc\'ad
\f0 \
    public static int fibonacci(int n) \{\
		if (n < 2) \{\
			return n;\
		\} \
		else \{\
			return fibonacci(n-1) + fibonacci(n-2);\
		\}\
	\}\
\}}