#include<bits/stdc++.h>
#include<fstream>
using namespace std;
int main()
{
	ifstream fin;
	ofstream fout;
		int noQtn=2;
	//Add Questions in Questions.txt
	
	fout.open("Answers.txt");
	if(fout.is_open())
	{
	string qts="";
	cout<<"\n\t\t\tEnter Your answers in form(Space Separated) : \n\t\t\te.g.	Write Your Guesses Here [Press Enter]\n";
			getline(cin>>ws,qts);
			fout<<qts<<"\n";
		cout<<"Guesses Added SucessFully";
	}
	fout.close();
}

