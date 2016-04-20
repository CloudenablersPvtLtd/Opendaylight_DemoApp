# Opendaylight_DemoApp
Opendaylight(Beryllium Release) Controller Application

Steps to setup this ODL DemoApp:

Prerequisites:
 * Maven 3.1.1 or above 
 * Java 7 or above

Configure Maven:

 * cp -n ~/.m2/settings.xml{,.orig} ; \wget -q -O - https://raw.githubusercontent.com/opendaylight/odlparent/stable/beryllium/ settings.xml > ~/.m2/settings.xml

Build the project & start karaf container:

 * cd networkoptimizer
 * mvn clean install
 * karaf/target/assembly/bin/karaf

Verify the networkoptimizer RPC in Opendaylight API Doc Explorer UI:

 * Access this URL to get Opendaylight API Doc Explorer with default credentials (admin/admin)
	http://127.0.0.1:8181/apidoc/explorer/index.html

 * Select networkoptimizer module and provide below request structure to test the RPC.

POST /operations/networkoptimizer:service-account

Request:
{
  "input":{
  "name": "Demo_App",
  "description": "Simple ODL App"
  }
}


Response:
{
  "output": {
    "service_name": "RPC request successful for Service: Demo_App"
  }
}

