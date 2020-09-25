#include <stdio.h>
int main()
{
	int i,j,x[1000],S,R,l1,l2,count=0;
    scanf("%d %d",&S,&R);
	for(i=0;i<S;i++)
      scanf("%d",&x[i]);
  	for(i=0;i<R;i++){
		scanf("%d %d",&l1,&l2);
  		for(j=0;j<S;j++){
      		if(x[j]>=l1 && x[j]<=l2)
              count++;
        }
      	printf("%d ",count);
      	count=0;
    }
  	return 0;
}