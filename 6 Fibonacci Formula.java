{\rtf1\ansi\ansicpg936\cocoartf1671\cocoasubrtf500
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww12600\viewh10200\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs28 \cf0 //
\f1 \'ec\'b3\'b2\'a8\'c4\'c7\'c6\'f5\'ca\'fd\'c1\'d0
\f0 --
\f1 \'b9\'ab\'ca\'bd\'b7\'a8
\f0 \
public class Solution \{\
    public static void main(String []args) \{\
		System.out.print(fibonacci(10));\
    \}\
	\
	//
\f1 \'b9\'ab\'ca\'bd\'b7\'a8\'b5\'c4\'b4\'fa\'c2\'eb\'ca\'c7\'d7\'ee\'b6\'cc\'b5\'c4\'a3\'ac\'b1\'be\'c9\'ed\'d2\'b2\'c3\'bb\'d3\'d0\'ca\'b2\'c3\'b4\'d0\'e8\'d2\'aa\'d7\'a2\'ca\'cd\'b5\'c4\'a1\'a3\'be\'df\'cc\'e5\'b5\'c4\'cd\'c6\'c0\'ed\'b9\'fd\'b3\'cc\'c7\'eb\'bf\'b4\'ce\'d2\'b5\'c4\'b2\'a9\'bf\'cd
\f0 \
    public static int fibonacci(int n) \{\
		if(n < 2)\
			return n;\
		\
		double sqrt5=Math.sqrt(5);\
        double fibn=Math.pow((1+sqrt5)/2,n)-Math.pow((1-sqrt5)/2,n);\
        return (int)(fibn/sqrt5);\
    \}\
\}}