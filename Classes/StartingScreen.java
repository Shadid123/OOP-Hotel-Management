����   A V  Classes/StartingScreen  javax/swing/JFrame <init> ()V Code
  	    javax/swing/ImageIcon  Icons/StartingScreen.gif
    java/lang/ClassLoader   getSystemResource "(Ljava/lang/String;)Ljava/net/URL;
 
    (Ljava/net/URL;)V  javax/swing/JLabel
     (Ljavax/swing/Icon;)V
     	setBounds (IIII)V
  ! " # add *(Ljava/awt/Component;)Ljava/awt/Component;
  % & ' 	setLayout (Ljava/awt/LayoutManager;)V
  ) * + setLocation (II)V
  - . + setSize
  0 1 2 
setVisible (Z)V      X
 6 8 7 java/lang/Thread 9 : sleep (J)V < Classes/LoginPage
 ; 	
 ? A @ java/lang/Exception B  printStackTrace LineNumberTable LocalVariableTable this LClasses/StartingScreen; 	imageIcon Ljavax/swing/ImageIcon; label Ljavax/swing/JLabel; e Ljava/lang/Exception; StackMapTable main ([Ljava/lang/String;)V 
Exceptions
  	 args [Ljava/lang/String; 
SourceFile StartingScreen.java !                    c*� � 
Y� � L� Y+� M,�� *,�  W*� $* �
� (*�� ,*� / 3� 5� ;� =*� /� N-� >�  I Z ] ?  C   >           &  , + 1 , : - D . I 1 O 2 U 3 Z 5 ^ 6 b < D   *    c E F    R G H   I I J  ^  K L  M    � ]   
   ? 	 N O  P     ?    5     � � Q�    C   
    >  ? D        R S    T    U