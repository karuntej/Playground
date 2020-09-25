#include <iostream>
using namespace std;

int main() 
{
   	int i,j,a[100],b[100]={0},n;
  	cin>>n;
  	j=n;
  	for(i=0;i<n;i++)
        cin>>a[i];
  	for(i=0;i<n;i++){
    	if(a[i]==1)
          b[--j]=a[i];
    }
  	for(i=0;i<n;i++){
    	cout<<b[i];
    }
    return 0;
}