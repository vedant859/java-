<%-- =========================================================
1. JSP: Check Voter Eligibility
URL: voter.jsp?age=18
========================================================= --%>

<%
int age = Integer.parseInt(request.getParameter("age"));
if(age >= 18)
    out.println("Eligible for Voting");
else
    out.println("Not Eligible");
%>


<%-- =========================================================
2. JSP: Check Prime Number (Result in Red Color)
URL: prime.jsp?n=7
========================================================= --%>

<%
int n = Integer.parseInt(request.getParameter("n"));
boolean prime = true;

for(int i=2; i<=n/2; i++){
    if(n % i == 0){
        prime = false;
        break;
    }
}
%>

<font color="red">
<%= (prime && n>1) ? "Prime Number" : "Not Prime" %>
</font>


<%-- =========================================================
3. JSP: Factorial of a Number
URL: fact.jsp?n=5
========================================================= --%>

<%
int num = Integer.parseInt(request.getParameter("n"));
int fact = 1;

for(int i=1; i<=num; i++)
    fact *= i;

out.println("Factorial = " + fact);
%>


<%-- =========================================================
4. JSP: Perfect Number (Using Include Directive)
========================================================= --%>

<%-- main.jsp --%>
<%@ include file="perfectLogic.jsp" %>

<%
int p = Integer.parseInt(request.getParameter("n"));
if(isPerfect(p))
    out.println("Perfect Number");
else
    out.println("Not Perfect");
%>

<%-- perfectLogic.jsp --%>
<%! 
boolean isPerfect(int n){
    int sum = 0;
    for(int i=1; i<n; i++){
        if(n % i == 0)
            sum += i;
    }
    return sum == n;
}
%>


<%-- =========================================================
5. JSP: Reverse a String
URL: reverse.jsp?str=hello
========================================================= --%>

<%
String str = request.getParameter("str");
String rev = "";

for(int i=str.length()-1; i>=0; i--)
    rev += str.charAt(i);

out.println("Reversed String: " + rev);
%>


<%-- =========================================================
6. JSP: Simple Interest
URL: si.jsp?p=1000&r=5&t=2
========================================================= --%>

<%
double p1 = Double.parseDouble(request.getParameter("p"));
double r = Double.parseDouble(request.getParameter("r"));
double t = Double.parseDouble(request.getParameter("t"));

double si = (p1 * r * t) / 100;

out.println("Simple Interest = " + si);
%>


<%-- =========================================================
7. JSP: Digits of Number in Words
URL: words.jsp?n=123
========================================================= --%>

<%
int num1 = Integer.parseInt(request.getParameter("n"));
String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

while(num1 > 0){
    int d = num1 % 10;
    out.print(words[d] + " ");
    num1 /= 10;
}
%>


<%-- =========================================================
8. JSP: Sum of First and Last Digit
URL: sum.jsp?n=1234
========================================================= --%>

<%
int num2 = Integer.parseInt(request.getParameter("n"));
int last = num2 % 10;

while(num2 >= 10)
    num2 /= 10;

int first = num2;

out.println("Sum = " + (first + last));
%>


<%-- =========================================================
9. JSP: Voting Eligibility (Again using Age)
URL: vote.jsp?age=20
========================================================= --%>

<%
int a = Integer.parseInt(request.getParameter("age"));

if(a >= 18)
    out.println("Eligible to Vote");
else
    out.println("Not Eligible to Vote");
%>
