# Flow Oriented Programming

[![Build Status](https://travis-ci.org/rafaelspinto/flow.svg?branch=master)](https://travis-ci.org/rafaelspinto/flow)

The objective of this project is to provide a framework to design interactions between system components using a flow oriented approach. 

A system is composed by the following components: an Agent, an Engine, Action(s), Event(s), Adapter(s) and App(s).

E.g. A person (**Agent**) wants to send a message via email (**Action**) to another person. To be able to send the message an email client (**Adapter**) is required. The email client will then communicate via http (**Event**) to the email server (**App**). 


To make this possible, the framework specifies 5 types of components:

* IAgent
* IAction 
* IAdapter
* IEvent
* IApp
