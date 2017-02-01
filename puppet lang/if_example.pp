$os_name == $facts['os']['name']{
  if $os_name =='centos' {
      notify { 'i am in centos': } 
  }  
        
   elsif $os_name =='ubuntu' {
      notify { 'i am in ubuntu': } 
  } 

  elsif $os_name =='fedora' {
      notify { 'i am in fedora': } 
  } 
  else $os_name =='opensuse' {
      notify { 'i am in opensuse': } 
  } 
      
        default:{
            #code
         notify { "i lost please help. i am os named ${facts['os']['name']}": } 
        }
}