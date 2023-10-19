<p>A <strong>superclass&nbsp;</strong>defines common behavior for related subclasses. An <strong>interface&nbsp;</strong>can be used to define common behavior for classes (including unrelated classes).</p>
<p>
    <style></style>An <strong>abstract class</strong> cannot be used to create objects. An <strong>abstract class</strong> can contain abstract methods that are implemented in concrete subclasses.
</p>
<style></style>
<p><strong><span style="font-size: 18px;"><u>Interesting Points about Abstract Classes</u></span></strong></p>
<ul style="list-style-type: square;">
    <li><strong>An abstract method cannot be contained in a nonabstract class. </strong>If a subclass of an abstract superclass does not implement all the abstract methods, the subclass must be defined as abstract. In other words, in a nonabstract subclass extended from an abstract class, all the abstract methods must be implemented. Also note abstract methods are nonstatic.</li>
    <li>&nbsp;<strong>An abstract class cannot be instantiated using the new operator</strong>, but you can still define its constructors, which are invoked in the constructors of its subclasses. For instance, the constructors of GeometricObject are invoked in the Circle class and the Rectangle class.</li>
    <li><strong>A class that contains abstract methods must be abstract.</strong> However, it is possible to define an abstract class that doesn&rsquo;t contain any abstract methods. This abstract class is used as a base class for defining subclasses.</li>
    <li>&nbsp;<strong>A subclass can override a method from its superclass to define it as abstract.</strong> This is very unusual, but it is useful when the implementation of the method in the superclass becomes invalid in the subclass. In this case, the subclass must be defined as abstract.</li>
    <li><strong>A subclass can be abstract even if its superclass is concrete. </strong>For example, the Object class is concrete, but its subclasses, such as GeometricObject, may be abstract.</li>
    <li>&nbsp;Y<strong>ou cannot create an instance from an abstract class using the new operator, but an abstract class can be used as a data type.</strong> Therefore, the following statement, which creates an array whose elements are of the GeometricObject type, is correct:<ul>
            <li style="font-style: italic;"><em>GeometricObject[] objects = </em><span style="color:rgb(33,48,131);"><em>new&nbsp;</em></span><em>GeometricObject[10];</em></li>
            <li>You can then create an instance of GeometricObject and assign its reference to the array like this:<br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <em>objects[0] = </em><span style="color:rgb(33,48,131);"><em>new&nbsp;</em></span><em>Circle();</em></li>
        </ul>
    </li>
</ul>
<p><br></p>
<p><span style="text-align: start;color: rgb(236, 236, 241);background-color: rgb(52, 53, 65);font-size: 16px;"><strong>What are the main differences between the abstract class and the interface in Java?</strong></span></p>
<p><a data-fr-linked="true" href="https://chat.openai.com/share/57d2ef37-7dbe-4ebc-aecc-d2501a292831">https://chat.openai.com/share/57d2ef37-7dbe-4ebc-aecc-d2501a292831</a></p>
<p><br style="text-align: -webkit-auto;"><br></p>