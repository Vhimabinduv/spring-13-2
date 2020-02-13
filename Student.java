package com.vp.model;

public class Student {
int uid;
  String uname;
  String subject;
public Student() {
super();
// TODO Auto-generated constructor stub
}
public Student(int uid, String uname, String subject) {
super();
this.uid = uid;
this.uname = uname;
this.subject = subject;
}
@Override
public String toString() {
return "Student [uid=" + uid + ", uname=" + uname + ", subject=" + subject + "]";
}
public int getUid() {
return uid;
}
public void setUid(int uid) {
this.uid = uid;
}
public String getUname() {
return uname;
}
public void setUname(String uname) {
this.uname = uname;
}
public String getSubject() {
return subject;
}
public void setSubject(String subject) {
this.subject = subject;
}
}
