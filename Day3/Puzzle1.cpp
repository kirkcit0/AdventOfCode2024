#include <cctype>
#include <iostream>
#include <fstream>
#include <istream>
#include <string>
using namespace std;

int main(){
    ifstream file;
    file.open("input.txt");
    string line;
    int sum = 0;
    while (getline(file, line)) {
        int n = line.length();
        for(int i=3; i<n; i++){
            // cout << 1 << endl;
            if(line[i-3] == 'm' && line[i-2] == 'u' && line[i-1] == 'l' && line[i] == '('){
                i++;
                string a = "";
                string b = "";
                bool comma = false;
                while(1){
                    if(isdigit(line[i])){
                        if(!comma) {
                            a += line[i];
                        } else {
                            b += line[i];
                        }
                    } else if(line[i] == ','){
                        if(!comma){
                            comma = true;
                        } else {
                            break;
                        }
                    } else if (line[i] == ')'){
                        break;
                    } else {
                        a = "";
                        b = "";
                        break;
                    }
                    i++;
                    // break;
                }
                if(a != "" && b!= ""){
                    // cout << sum << " + " << a << " * " << b;
                    sum += stoi(a) * stoi(b);
                    // cout << " = " << sum << endl;
                }
            }
        }
    }

    cout << sum << endl;




    file.close();
    return 0;
}