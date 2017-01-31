#if $facts['os']['family'] == 'ubuntu' {
 # $package_name = 'httpd'
    # enter puppet code
#}
#else {
 #   $package_name = 'apache2'
#}
 $package_name = $facts['os']['family']?{
  'ubuntu' => 'httpd',
  'debian' => 'apache2',   
 }
 notify { $package_name: } 
 