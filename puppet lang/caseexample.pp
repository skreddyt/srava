case $facts['os']['name']{
    'centos':{
        #code
        notify { 'i am in centos': } 
         
    }
     'ubuntu':{
    notify { 'i am in ubuntu': } 
    }
     'fedora':{
         notify { 'i am in frdora': } 
        }
      
        default:{
            #code
         notify { "i lost please help. i am os named ${facts['os']['name']}": } 
        }
}