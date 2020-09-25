#include <iostream>
using namespace std;
void isAnagram(string s1,string s2){
	int i,freq[26]={0};
  	for(i=0;i<s1.length();i++)
      freq[s1[i]-'a']++;
  	for(i=0;i<s2.length();i++)
      freq[s2[i]-'a']--;
  	for(i=0;i<26;i++){
      if(freq[i]!=0){
        cout<<"Not anagrams";
      	return;
      }
    }
  	cout<<"Anagram";
}
int main() 
{
   	string s1,s2;
  	cin>>s1>>s2;
  	isAnagram(s1,s2);
    return 0;
}