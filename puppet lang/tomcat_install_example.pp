$tomcat_pname = $facts['os']['family'] ? {
    'ubuntu' => 'tomcat',
    'debian' => 'tomcat7',

}
package { '$tomcat_pname':
    ensure => installed,
    
}
service { "tomcat":
    ensure     => running,
    enable     => true,
    
}
